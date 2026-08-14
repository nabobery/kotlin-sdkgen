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
 * sdkgen://source/openapi.json#/components/schemas/card/properties/available_payout_methods/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/card/properties/available_payout_methods/items
 */
@Serializable(with = InlineCardAvailablePayoutMethodsItemX6e61c572.Serializer::class)
public sealed class InlineCardAvailablePayoutMethodsItemX6e61c572 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineCardAvailablePayoutMethodsItemX6e61c572() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineCardAvailablePayoutMethodsItemX6e61c572() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCardAvailablePayoutMethodsItemX6e61c572()

  public companion object {
    public fun fromValue(`value`: String): InlineCardAvailablePayoutMethodsItemX6e61c572 = when (value) {
      Instant.value -> Instant
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCardAvailablePayoutMethodsItemX6e61c572> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCardAvailablePayoutMethodsItemX6e61c572", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCardAvailablePayoutMethodsItemX6e61c572 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCardAvailablePayoutMethodsItemX6e61c572) {
      encoder.encodeString(value.value)
    }
  }
}
