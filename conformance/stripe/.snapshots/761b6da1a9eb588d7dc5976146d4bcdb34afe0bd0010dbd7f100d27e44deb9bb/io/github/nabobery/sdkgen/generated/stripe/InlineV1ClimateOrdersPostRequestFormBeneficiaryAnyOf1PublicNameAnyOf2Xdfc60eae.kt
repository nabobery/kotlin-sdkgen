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
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/beneficiary/anyOf/0/properties/public_name/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/beneficiary/anyOf/0/properties/public_name/anyOf/1
 */
@Serializable(with = InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae.Serializer::class)
public sealed class InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae) {
      encoder.encodeString(value.value)
    }
  }
}
