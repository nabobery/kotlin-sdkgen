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
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/settlement_timing/properties/start_of_day/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/settlement_timing/properties/start_of_day/anyOf/1
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d.Serializer::class)
public sealed class InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsSettlementTimingAnyOf2X8e10678d) {
      encoder.encodeString(value.value)
    }
  }
}
