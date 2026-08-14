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
 * Indicates whether the cardholder provided a postal code and if it matched the cardholder’s billing address.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_succeeded_card/properties/addr
 * ess_postal_code_check
 */
@Serializable(with = InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a.Serializer::class)
public sealed class InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `unchecked`.
   */
  public data object Unchecked : InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a() {
    public override val `value`: String = "unchecked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a = when (value) {
      Fail.value -> Fail
      Pass.value -> Pass
      Unavailable.value -> Unavailable
      Unchecked.value -> Unchecked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPayfa19AddressPostalCodeCheckX8169f88a) {
      encoder.encodeString(value.value)
    }
  }
}
