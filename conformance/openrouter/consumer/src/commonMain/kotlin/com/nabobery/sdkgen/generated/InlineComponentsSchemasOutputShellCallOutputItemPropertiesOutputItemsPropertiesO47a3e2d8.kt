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
 * /oneOf/0/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8
  .Serializer::class)
public sealed class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exit`.
   */
  public data object Exit : InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8() {
    public override val `value`: String = "exit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8 = when (value) {
      Exit.value -> Exit
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesO47a3e2d8) {
      encoder.encodeString(value.value)
    }
  }
}
