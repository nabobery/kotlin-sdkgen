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
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/selection/properties/choices/items/properties/
 * style.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/selection/properties/choices/items/properties/
 * style
 */
@Serializable(with = InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9.Serializer::class)
public sealed class InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `primary`.
   */
  public data object Primary : InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9() {
    public override val `value`: String = "primary"
  }

  /**
   * Documented value. Wire value: `secondary`.
   */
  public data object Secondary : InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9() {
    public override val `value`: String = "secondary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9 = when (value) {
      Primary.value -> Primary
      Secondary.value -> Secondary
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCol2891PostRequestFormInputsItemSelectionStyleXa87c9bd9) {
      encoder.encodeString(value.value)
    }
  }
}
