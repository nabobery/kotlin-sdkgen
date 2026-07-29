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
 * The state of the status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1statuses~1{sha}/post/requestBody/content/application~1j
 * son/schema/properties/state
 */
@Serializable(with = InlineReposStatusesPostRequestJsonStateXbfdad4b2.Serializer::class)
public sealed class InlineReposStatusesPostRequestJsonStateXbfdad4b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineReposStatusesPostRequestJsonStateXbfdad4b2() {
    public override val `value`: String = "error"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineReposStatusesPostRequestJsonStateXbfdad4b2() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineReposStatusesPostRequestJsonStateXbfdad4b2() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineReposStatusesPostRequestJsonStateXbfdad4b2() {
    public override val `value`: String = "success"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposStatusesPostRequestJsonStateXbfdad4b2()

  public companion object {
    public fun fromValue(`value`: String): InlineReposStatusesPostRequestJsonStateXbfdad4b2 = when (value) {
      Error.value -> Error
      Failure.value -> Failure
      Pending.value -> Pending
      Success.value -> Success
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposStatusesPostRequestJsonStateXbfdad4b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposStatusesPostRequestJsonStateXbfdad4b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposStatusesPostRequestJsonStateXbfdad4b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposStatusesPostRequestJsonStateXbfdad4b2) {
      encoder.encodeString(value.value)
    }
  }
}
