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
 * The state of the advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/state
 */
@Serializable(with = InlineRepositoryAdvisoryStateX956f296d.Serializer::class)
public sealed class InlineRepositoryAdvisoryStateX956f296d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineRepositoryAdvisoryStateX956f296d() {
    public override val `value`: String = "published"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineRepositoryAdvisoryStateX956f296d() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `withdrawn`.
   */
  public data object Withdrawn : InlineRepositoryAdvisoryStateX956f296d() {
    public override val `value`: String = "withdrawn"
  }

  /**
   * Documented value. Wire value: `draft`.
   */
  public data object Draft : InlineRepositoryAdvisoryStateX956f296d() {
    public override val `value`: String = "draft"
  }

  /**
   * Documented value. Wire value: `triage`.
   */
  public data object Triage : InlineRepositoryAdvisoryStateX956f296d() {
    public override val `value`: String = "triage"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryAdvisoryStateX956f296d()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryAdvisoryStateX956f296d = when (value) {
      Published.value -> Published
      Closed.value -> Closed
      Withdrawn.value -> Withdrawn
      Draft.value -> Draft
      Triage.value -> Triage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryStateX956f296d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryAdvisoryStateX956f296d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryStateX956f296d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryStateX956f296d) {
      encoder.encodeString(value.value)
    }
  }
}
