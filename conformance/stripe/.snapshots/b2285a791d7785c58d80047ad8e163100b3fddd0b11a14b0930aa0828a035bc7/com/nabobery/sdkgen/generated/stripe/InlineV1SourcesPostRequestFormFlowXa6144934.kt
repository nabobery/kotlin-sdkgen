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
 * The authentication `flow` of the source to create. `flow` is one of `redirect`, `receiver`, `code_verification`,
 * `none`. It is generally inferred unless a type supports multiple flows.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/flow
 */
@Serializable(with = InlineV1SourcesPostRequestFormFlowXa6144934.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormFlowXa6144934 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_verification`.
   */
  public data object CodeVerification : InlineV1SourcesPostRequestFormFlowXa6144934() {
    public override val `value`: String = "code_verification"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1SourcesPostRequestFormFlowXa6144934() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `receiver`.
   */
  public data object Receiver : InlineV1SourcesPostRequestFormFlowXa6144934() {
    public override val `value`: String = "receiver"
  }

  /**
   * Documented value. Wire value: `redirect`.
   */
  public data object Redirect : InlineV1SourcesPostRequestFormFlowXa6144934() {
    public override val `value`: String = "redirect"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SourcesPostRequestFormFlowXa6144934()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormFlowXa6144934 = when (value) {
      CodeVerification.value -> CodeVerification
      None.value -> None
      Receiver.value -> Receiver
      Redirect.value -> Redirect
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormFlowXa6144934> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormFlowXa6144934", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormFlowXa6144934 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormFlowXa6144934) {
      encoder.encodeString(value.value)
    }
  }
}
