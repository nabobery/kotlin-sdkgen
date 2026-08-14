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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_credits/get/responses/200/content/application~1json/sche
 * ma/properties/object
 */
@Serializable(with = InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85.Serializer::class)
public sealed class InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryReceivedCreditsGetResponse200JsonObjectValueXb04b6b85) {
      encoder.encodeString(value.value)
    }
  }
}
