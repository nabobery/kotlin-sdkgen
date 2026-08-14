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
 * sdkgen://source/openapi.json#/components/schemas/portal_subscription_cancellation_reason/properties/options/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/portal_subscription_cancellation_reason/properties/options/items
 */
@Serializable(with = InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95.Serializer::class)
public sealed class InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `customer_service`.
   */
  public data object CustomerService : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95() {
    public override val `value`: String = "customer_service"
  }

  /**
   * Documented value. Wire value: `low_quality`.
   */
  public data object LowQuality : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95() {
    public override val `value`: String = "low_quality"
  }

  /**
   * Documented value. Wire value: `missing_features`.
   */
  public data object MissingFeatures : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95() {
    public override val `value`: String = "missing_features"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `switched_service`.
   */
  public data object SwitchedService : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95() {
    public override val `value`: String = "switched_service"
  }

  /**
   * Documented value. Wire value: `too_complex`.
   */
  public data object TooComplex : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95() {
    public override val `value`: String = "too_complex"
  }

  /**
   * Documented value. Wire value: `too_expensive`.
   */
  public data object TooExpensive : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95() {
    public override val `value`: String = "too_expensive"
  }

  /**
   * Documented value. Wire value: `unused`.
   */
  public data object Unused : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95() {
    public override val `value`: String = "unused"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95 = when (value) {
      CustomerService.value -> CustomerService
      LowQuality.value -> LowQuality
      MissingFeatures.value -> MissingFeatures
      Other.value -> Other
      SwitchedService.value -> SwitchedService
      TooComplex.value -> TooComplex
      TooExpensive.value -> TooExpensive
      Unused.value -> Unused
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalSubscriptionCancellationReasonOptionsItemX410d9b95) {
      encoder.encodeString(value.value)
    }
  }
}
