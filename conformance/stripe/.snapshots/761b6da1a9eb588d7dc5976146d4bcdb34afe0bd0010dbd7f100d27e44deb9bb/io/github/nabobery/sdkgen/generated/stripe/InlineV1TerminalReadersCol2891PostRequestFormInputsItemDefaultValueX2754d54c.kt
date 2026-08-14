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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/toggles/items/properties/default_value.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/toggles/items/properties/default_value
 */
@Serializable(with = InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c.Serializer::class)
public sealed class InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c) {
      encoder.encodeString(value.value)
    }
  }
}
