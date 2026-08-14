package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Action taken when the builtin filter triggers
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentFilterBuiltinAction
 */
@Serializable(with = ContentFilterBuiltinAction.Serializer::class)
public sealed class ContentFilterBuiltinAction {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `redact`.
   */
  public data object Redact : ContentFilterBuiltinAction() {
    public override val `value`: String = "redact"
  }

  /**
   * Documented value. Wire value: `block`.
   */
  public data object Block : ContentFilterBuiltinAction() {
    public override val `value`: String = "block"
  }

  /**
   * Documented value. Wire value: `flag`.
   */
  public data object Flag : ContentFilterBuiltinAction() {
    public override val `value`: String = "flag"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ContentFilterBuiltinAction()

  public companion object {
    public fun fromValue(`value`: String): ContentFilterBuiltinAction = when (value) {
      Redact.value -> Redact
      Block.value -> Block
      Flag.value -> Flag
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ContentFilterBuiltinAction> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.ContentFilterBuiltinAction", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ContentFilterBuiltinAction = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ContentFilterBuiltinAction) {
      encoder.encodeString(value.value)
    }
  }
}
