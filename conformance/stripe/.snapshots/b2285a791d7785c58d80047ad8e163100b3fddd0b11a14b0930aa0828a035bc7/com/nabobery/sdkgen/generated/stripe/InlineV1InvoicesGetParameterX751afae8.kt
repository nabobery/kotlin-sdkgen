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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/parameters/9/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/parameters/9/schema
 */
@Serializable(with = InlineV1InvoicesGetParameterX751afae8.Serializer::class)
public sealed class InlineV1InvoicesGetParameterX751afae8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `draft`.
   */
  public data object Draft : InlineV1InvoicesGetParameterX751afae8() {
    public override val `value`: String = "draft"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineV1InvoicesGetParameterX751afae8() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `paid`.
   */
  public data object Paid : InlineV1InvoicesGetParameterX751afae8() {
    public override val `value`: String = "paid"
  }

  /**
   * Documented value. Wire value: `uncollectible`.
   */
  public data object Uncollectible : InlineV1InvoicesGetParameterX751afae8() {
    public override val `value`: String = "uncollectible"
  }

  /**
   * Documented value. Wire value: `void`.
   */
  public data object Void : InlineV1InvoicesGetParameterX751afae8() {
    public override val `value`: String = "void"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesGetParameterX751afae8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesGetParameterX751afae8 = when (value) {
      Draft.value -> Draft
      Open.value -> Open
      Paid.value -> Paid
      Uncollectible.value -> Uncollectible
      Void.value -> Void
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesGetParameterX751afae8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesGetParameterX751afae8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesGetParameterX751afae8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesGetParameterX751afae8) {
      encoder.encodeString(value.value)
    }
  }
}
