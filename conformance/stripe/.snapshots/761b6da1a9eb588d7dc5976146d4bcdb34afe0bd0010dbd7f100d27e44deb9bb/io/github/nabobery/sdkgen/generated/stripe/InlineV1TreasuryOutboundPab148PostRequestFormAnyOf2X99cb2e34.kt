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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/phone/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data/properties/billing_details/properties/phone/anyOf/1
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34.Serializer::class)
public sealed class InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormAnyOf2X99cb2e34) {
      encoder.encodeString(value.value)
    }
  }
}
