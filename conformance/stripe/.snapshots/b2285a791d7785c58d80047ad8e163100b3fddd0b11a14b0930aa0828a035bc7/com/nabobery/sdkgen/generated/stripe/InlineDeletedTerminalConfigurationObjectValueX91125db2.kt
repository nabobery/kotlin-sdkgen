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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_terminal.configuration/properties/object
 */
@Serializable(with = InlineDeletedTerminalConfigurationObjectValueX91125db2.Serializer::class)
public sealed class InlineDeletedTerminalConfigurationObjectValueX91125db2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `terminal.configuration`.
   */
  public data object TerminalConfiguration : InlineDeletedTerminalConfigurationObjectValueX91125db2() {
    public override val `value`: String = "terminal.configuration"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedTerminalConfigurationObjectValueX91125db2()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedTerminalConfigurationObjectValueX91125db2 = when (value) {
      TerminalConfiguration.value -> TerminalConfiguration
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDeletedTerminalConfigurationObjectValueX91125db2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedTerminalConfigurationObjectValueX91125db2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedTerminalConfigurationObjectValueX91125db2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedTerminalConfigurationObjectValueX91125db2) {
      encoder.encodeString(value.value)
    }
  }
}
