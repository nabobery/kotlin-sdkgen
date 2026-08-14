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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/dob/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/dob/anyOf/1
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9.Serializer::class)
public sealed class InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDobAnyOf2Xf992f3b9) {
      encoder.encodeString(value.value)
    }
  }
}
