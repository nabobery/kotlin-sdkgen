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
 * This parameter defines the skip behavior for input collection.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1terminal~1readers~1{reader}~1succeed_input_collection/post/re
 * questBody/content/application~1x-www-form-urlencoded/schema/properties/skip_non_required_inputs
 */
@Serializable(with = InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50.Serializer::class)
public sealed class InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50 = when (value) {
      All.value -> All
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTermina5024PostRequestFormSkipNonRequiredInputsX1abc7a50) {
      encoder.encodeString(value.value)
    }
  }
}
