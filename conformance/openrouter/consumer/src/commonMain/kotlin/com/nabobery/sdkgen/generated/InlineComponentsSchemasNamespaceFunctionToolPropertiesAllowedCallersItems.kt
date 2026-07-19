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
 * sdkgen://source/openapi.yaml#/components/schemas/NamespaceFunctionTool/properties/allowed_callers/items.
 */
@Serializable(with = InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems.Serializer::class)
public sealed class InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems() {
    public override val `value`: String = "direct"
  }

  /**
   * Documented value. Wire value: `programmatic`.
   */
  public data object Programmatic : InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems() {
    public override val `value`: String = "programmatic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems =
      when (value) {
      Direct.value -> Direct
      Programmatic.value -> Programmatic
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasNamespaceFunctionToolPropertiesAllowedCallersItems) {
      encoder.encodeString(value.value)
    }
  }
}
