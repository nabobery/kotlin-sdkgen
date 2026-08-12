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
 * State of this Pull Request. Either `open` or `closed`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request/properties/state
 */
@Serializable(with = InlinePullRequestStateXf09bd486.Serializer::class)
public sealed class InlinePullRequestStateXf09bd486 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlinePullRequestStateXf09bd486() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlinePullRequestStateXf09bd486() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePullRequestStateXf09bd486()

  public companion object {
    public fun fromValue(`value`: String): InlinePullRequestStateXf09bd486 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePullRequestStateXf09bd486> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePullRequestStateXf09bd486", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePullRequestStateXf09bd486 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestStateXf09bd486) {
      encoder.encodeString(value.value)
    }
  }
}
