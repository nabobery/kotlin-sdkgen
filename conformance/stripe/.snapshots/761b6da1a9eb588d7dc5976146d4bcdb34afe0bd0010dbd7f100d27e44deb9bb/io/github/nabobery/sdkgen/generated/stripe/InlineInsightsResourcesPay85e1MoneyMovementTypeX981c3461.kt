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
 * Describes the type of money movement. Currently only `card` is supported.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_money_movement_details/propert
 * ies/money_movement_type
 */
@Serializable(with = InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461.Serializer::class)
public sealed class InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPay85e1MoneyMovementTypeX981c3461) {
      encoder.encodeString(value.value)
    }
  }
}
