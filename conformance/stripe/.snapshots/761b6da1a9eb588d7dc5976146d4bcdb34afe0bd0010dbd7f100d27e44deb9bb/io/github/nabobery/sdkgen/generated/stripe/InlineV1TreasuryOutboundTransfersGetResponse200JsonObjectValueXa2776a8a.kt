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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/get/responses/200/content/application~1json/sc
 * hema/properties/object
 */
@Serializable(with = InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a.Serializer::class)
public sealed class InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundTransfersGetResponse200JsonObjectValueXa2776a8a) {
      encoder.encodeString(value.value)
    }
  }
}
