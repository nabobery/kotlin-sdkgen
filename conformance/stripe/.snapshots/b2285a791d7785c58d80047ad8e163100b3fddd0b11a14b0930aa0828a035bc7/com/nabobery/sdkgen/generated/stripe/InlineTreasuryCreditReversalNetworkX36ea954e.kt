package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The rails used to reverse the funds.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.credit_reversal/properties/network
 */
@Serializable(with = InlineTreasuryCreditReversalNetworkX36ea954e.Serializer::class)
public sealed class InlineTreasuryCreditReversalNetworkX36ea954e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineTreasuryCreditReversalNetworkX36ea954e() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlineTreasuryCreditReversalNetworkX36ea954e() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryCreditReversalNetworkX36ea954e()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryCreditReversalNetworkX36ea954e = when (value) {
      Ach.value -> Ach
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryCreditReversalNetworkX36ea954e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryCreditReversalNetworkX36ea954e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryCreditReversalNetworkX36ea954e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryCreditReversalNetworkX36ea954e) {
      encoder.encodeString(value.value)
    }
  }
}
