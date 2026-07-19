package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items/properties/outcome
 * /oneOf/1/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234
  .Serializer::class)
public sealed class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `timeout`.
   */
  public data object Timeout : InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234() {
    public override val `value`: String = "timeout"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234 = when (value) {
      Timeout.value -> Timeout
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOf7d57234) {
      encoder.encodeString(value.value)
    }
  }
}
