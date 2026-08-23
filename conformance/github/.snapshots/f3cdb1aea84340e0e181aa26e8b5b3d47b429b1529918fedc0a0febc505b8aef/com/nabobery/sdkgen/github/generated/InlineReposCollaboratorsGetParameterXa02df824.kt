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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1collaborators/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1collaborators/get/parameters/3/schema
 */
@Serializable(with = InlineReposCollaboratorsGetParameterXa02df824.Serializer::class)
public sealed class InlineReposCollaboratorsGetParameterXa02df824 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pull`.
   */
  public data object Pull : InlineReposCollaboratorsGetParameterXa02df824() {
    public override val `value`: String = "pull"
  }

  /**
   * Documented value. Wire value: `triage`.
   */
  public data object Triage : InlineReposCollaboratorsGetParameterXa02df824() {
    public override val `value`: String = "triage"
  }

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineReposCollaboratorsGetParameterXa02df824() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `maintain`.
   */
  public data object Maintain : InlineReposCollaboratorsGetParameterXa02df824() {
    public override val `value`: String = "maintain"
  }

  /**
   * Documented value. Wire value: `admin`.
   */
  public data object Admin : InlineReposCollaboratorsGetParameterXa02df824() {
    public override val `value`: String = "admin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCollaboratorsGetParameterXa02df824()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCollaboratorsGetParameterXa02df824 = when (value) {
      Pull.value -> Pull
      Triage.value -> Triage
      Push.value -> Push
      Maintain.value -> Maintain
      Admin.value -> Admin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCollaboratorsGetParameterXa02df824> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCollaboratorsGetParameterXa02df824", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCollaboratorsGetParameterXa02df824 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCollaboratorsGetParameterXa02df824) {
      encoder.encodeString(value.value)
    }
  }
}
