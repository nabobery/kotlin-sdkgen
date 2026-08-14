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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/destination_payment_method_options/properties/us_bank_account/anyOf/1
 */
@Serializable(with = InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493.Serializer::class)
public sealed class InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493) {
      encoder.encodeString(value.value)
    }
  }
}
