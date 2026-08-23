package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel/properties/type
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4.Serializer::class)
public sealed class InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `diesel`.
   */
  public data object Diesel : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4() {
    public override val `value`: String = "diesel"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `unleaded_plus`.
   */
  public data object UnleadedPlus : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4() {
    public override val `value`: String = "unleaded_plus"
  }

  /**
   * Documented value. Wire value: `unleaded_regular`.
   */
  public data object UnleadedRegular : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4() {
    public override val `value`: String = "unleaded_regular"
  }

  /**
   * Documented value. Wire value: `unleaded_super`.
   */
  public data object UnleadedSuper : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4() {
    public override val `value`: String = "unleaded_super"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4 = when (value) {
      Diesel.value -> Diesel
      Other.value -> Other
      UnleadedPlus.value -> UnleadedPlus
      UnleadedRegular.value -> UnleadedRegular
      UnleadedSuper.value -> UnleadedSuper
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelTypeXcdfb54c4) {
      encoder.encodeString(value.value)
    }
  }
}
