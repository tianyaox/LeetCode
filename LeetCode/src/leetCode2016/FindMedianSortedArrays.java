package leetCode2016;

public class FindMedianSortedArrays {
	public static void main(String[] args){
		System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{4,5,6}));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2){
		int len1 = nums1.length, len2 = nums2.length;
		int[] combinedNums = new int[len1+len2];
		int p1 = 0, p2 = 0, p = 0;
		while (p1<len1 && p2<len2){
			int n1 = nums1[p1], n2 = nums2[p2];
			if (n1<=n2){
				combinedNums[p] = n1;
				p1++;
			}
			else{
				combinedNums[p] = n2;
				p2++;
			}
			p++;
		}
		while(p1<len1){
			combinedNums[p] = nums1[p1];
			p1++;
			p++;
		}
		while(p2<len2){
			combinedNums[p] = nums2[p2];
			p2++;
			p++;
		}
		
		if ((len1+len2)%2==0){
			return (float)(combinedNums[(len1+len2)/2-1]+combinedNums[(len1+len2)/2])/2;
		}
		else{
			return (float)combinedNums[(len1+len2)/2];
		}
		
		
	}
}
