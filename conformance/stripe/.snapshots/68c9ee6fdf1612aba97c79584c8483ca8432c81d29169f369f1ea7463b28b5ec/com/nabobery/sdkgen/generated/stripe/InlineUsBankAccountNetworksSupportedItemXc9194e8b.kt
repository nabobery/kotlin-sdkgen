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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/us_bank_account_networks/properties/supported/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/us_bank_account_networks/properties/supported/items
 */
@Serializable(with = InlineUsBankAccountNetworksSupportedItemXc9194e8b.Serializer::class)
public sealed class InlineUsBankAccountNetworksSupportedItemXc9194e8b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach`.
   */
  public data object Ach : InlineUsBankAccountNetworksSupportedItemXc9194e8b() {
    public override val `value`: String = "ach"
  }

  /**
   * Documented value. Wire value: `us_domestic_wire`.
   */
  public data object UsDomesticWire : InlineUsBankAccountNetworksSupportedItemXc9194e8b() {
    public override val `value`: String = "us_domestic_wire"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsBankAccountNetworksSupportedItemXc9194e8b()

  public companion object {
    public fun fromValue(`value`: String): InlineUsBankAccountNetworksSupportedItemXc9194e8b = when (value) {
      Ach.value -> Ach
      UsDomesticWire.value -> UsDomesticWire
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUsBankAccountNetworksSupportedItemXc9194e8b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineUsBankAccountNetworksSupportedItemXc9194e8b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsBankAccountNetworksSupportedItemXc9194e8b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsBankAccountNetworksSupportedItemXc9194e8b) {
      encoder.encodeString(value.value)
    }
  }
}
