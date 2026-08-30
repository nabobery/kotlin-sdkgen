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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/diff-entry/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/diff-entry/properties/status
 */
@Serializable(with = InlineDiffEntryStatusX02e42487.Serializer::class)
public sealed class InlineDiffEntryStatusX02e42487 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `added`.
   */
  public data object Added : InlineDiffEntryStatusX02e42487() {
    public override val `value`: String = "added"
  }

  /**
   * Documented value. Wire value: `removed`.
   */
  public data object Removed : InlineDiffEntryStatusX02e42487() {
    public override val `value`: String = "removed"
  }

  /**
   * Documented value. Wire value: `modified`.
   */
  public data object Modified : InlineDiffEntryStatusX02e42487() {
    public override val `value`: String = "modified"
  }

  /**
   * Documented value. Wire value: `renamed`.
   */
  public data object Renamed : InlineDiffEntryStatusX02e42487() {
    public override val `value`: String = "renamed"
  }

  /**
   * Documented value. Wire value: `copied`.
   */
  public data object Copied : InlineDiffEntryStatusX02e42487() {
    public override val `value`: String = "copied"
  }

  /**
   * Documented value. Wire value: `changed`.
   */
  public data object Changed : InlineDiffEntryStatusX02e42487() {
    public override val `value`: String = "changed"
  }

  /**
   * Documented value. Wire value: `unchanged`.
   */
  public data object Unchanged : InlineDiffEntryStatusX02e42487() {
    public override val `value`: String = "unchanged"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDiffEntryStatusX02e42487()

  public companion object {
    public fun fromValue(`value`: String): InlineDiffEntryStatusX02e42487 = when (value) {
      Added.value -> Added
      Removed.value -> Removed
      Modified.value -> Modified
      Renamed.value -> Renamed
      Copied.value -> Copied
      Changed.value -> Changed
      Unchanged.value -> Unchanged
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDiffEntryStatusX02e42487> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDiffEntryStatusX02e42487", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDiffEntryStatusX02e42487 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDiffEntryStatusX02e42487) {
      encoder.encodeString(value.value)
    }
  }
}
