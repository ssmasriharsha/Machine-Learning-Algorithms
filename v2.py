class Solution:
	def trap(self, height: List[int]) -> int:

		length = len(height)

		left = [0] * length
		right = [0] * length

		left[0] = height[0]
		right[-1] = height[-1]

		