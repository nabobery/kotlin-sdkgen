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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings/properties/object
 */
@Serializable(with = InlineBalanceSettingsObjectValueX0b9d1564.Serializer::class)
public sealed class InlineBalanceSettingsObjectValueX0b9d1564 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balance_settings`.
   */
  public data object BalanceSettings : InlineBalanceSettingsObjectValueX0b9d1564() {
    public override val `value`: String = "balance_settings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBalanceSettingsObjectValueX0b9d1564()

  public companion object {
    public fun fromValue(`value`: String): InlineBalanceSettingsObjectValueX0b9d1564 = when (value) {
      BalanceSettings.value -> BalanceSettings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBalanceSettingsObjectValueX0b9d1564> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBalanceSettingsObjectValueX0b9d1564", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBalanceSettingsObjectValueX0b9d1564 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBalanceSettingsObjectValueX0b9d1564) {
      encoder.encodeString(value.value)
    }
  }
}
