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
 * Action taken when the pattern matches
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentFilterAction
 */
@Serializable(with = ContentFilterAction.Serializer::class)
public sealed class ContentFilterAction {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `redact`.
   */
  public data object Redact : ContentFilterAction() {
    public override val `value`: String = "redact"
  }

  /**
   * Documented value. Wire value: `block`.
   */
  public data object Block : ContentFilterAction() {
    public override val `value`: String = "block"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ContentFilterAction()

  public companion object {
    public fun fromValue(`value`: String): ContentFilterAction = when (value) {
      Redact.value -> Redact
      Block.value -> Block
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ContentFilterAction> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ContentFilterAction", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ContentFilterAction = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ContentFilterAction) {
      encoder.encodeString(value.value)
    }
  }
}
