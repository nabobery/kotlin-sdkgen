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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.settings/properties/object
 */
@Serializable(with = InlineTaxSettingsObjectValueX07ce6ab2.Serializer::class)
public sealed class InlineTaxSettingsObjectValueX07ce6ab2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax.settings`.
   */
  public data object TaxSettings : InlineTaxSettingsObjectValueX07ce6ab2() {
    public override val `value`: String = "tax.settings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxSettingsObjectValueX07ce6ab2()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxSettingsObjectValueX07ce6ab2 = when (value) {
      TaxSettings.value -> TaxSettings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxSettingsObjectValueX07ce6ab2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTaxSettingsObjectValueX07ce6ab2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxSettingsObjectValueX07ce6ab2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxSettingsObjectValueX07ce6ab2) {
      encoder.encodeString(value.value)
    }
  }
}
