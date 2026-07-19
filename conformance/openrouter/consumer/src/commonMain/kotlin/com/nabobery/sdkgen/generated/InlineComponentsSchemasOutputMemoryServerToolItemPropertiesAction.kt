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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputMemoryServerToolItem/properties/action.
 */
@Serializable(with = InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction.Serializer::class)
public sealed class InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction() {
    public override val `value`: String = "write"
  }

  /**
   * Documented value. Wire value: `delete`.
   */
  public data object Delete : InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction() {
    public override val `value`: String = "delete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction =
      when (value) {
      Read.value -> Read
      Write.value -> Write
      Delete.value -> Delete
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputMemoryServerToolItemPropertiesAction) {
      encoder.encodeString(value.value)
    }
  }
}
