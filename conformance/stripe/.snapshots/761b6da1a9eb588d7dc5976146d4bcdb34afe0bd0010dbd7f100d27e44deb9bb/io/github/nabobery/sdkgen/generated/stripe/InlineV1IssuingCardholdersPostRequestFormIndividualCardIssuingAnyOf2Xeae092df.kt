package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/card_issuing/properties/user_terms_acceptance/properties/user_agent/any
 * Of/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/card_issuing/properties/user_terms_acceptance/properties/user_agent/any
 * Of/1
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df.Serializer::class)
public sealed class InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingAnyOf2Xeae092df) {
      encoder.encodeString(value.value)
    }
  }
}
