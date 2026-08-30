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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/type
 */
@Serializable(with = InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726.Serializer::class)
public sealed class InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `email`.
   */
  public data object Email : InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726() {
    public override val `value`: String = "email"
  }

  /**
   * Documented value. Wire value: `numeric`.
   */
  public data object Numeric : InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726() {
    public override val `value`: String = "numeric"
  }

  /**
   * Documented value. Wire value: `phone`.
   */
  public data object Phone : InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726() {
    public override val `value`: String = "phone"
  }

  /**
   * Documented value. Wire value: `selection`.
   */
  public data object Selection : InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726() {
    public override val `value`: String = "selection"
  }

  /**
   * Documented value. Wire value: `signature`.
   */
  public data object Signature : InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726() {
    public override val `value`: String = "signature"
  }

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726 = when (value) {
      Email.value -> Email
      Numeric.value -> Numeric
      Phone.value -> Phone
      Selection.value -> Selection
      Signature.value -> Signature
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726) {
      encoder.encodeString(value.value)
    }
  }
}
