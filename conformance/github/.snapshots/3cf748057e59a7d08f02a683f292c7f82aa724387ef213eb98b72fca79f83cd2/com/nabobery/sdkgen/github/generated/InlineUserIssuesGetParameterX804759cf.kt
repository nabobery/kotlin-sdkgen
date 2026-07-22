package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1user~1issues/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1issues/get/parameters/1/schema
 */
@Serializable(with = InlineUserIssuesGetParameterX804759cf.Serializer::class)
public sealed class InlineUserIssuesGetParameterX804759cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineUserIssuesGetParameterX804759cf() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineUserIssuesGetParameterX804759cf() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineUserIssuesGetParameterX804759cf() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserIssuesGetParameterX804759cf()

  public companion object {
    public fun fromValue(`value`: String): InlineUserIssuesGetParameterX804759cf = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUserIssuesGetParameterX804759cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserIssuesGetParameterX804759cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserIssuesGetParameterX804759cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserIssuesGetParameterX804759cf) {
      encoder.encodeString(value.value)
    }
  }
}
