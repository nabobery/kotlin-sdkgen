package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * State of this codespace.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespace/properties/state
 */
@Serializable(with = InlineCodespaceStateX055cfe91.Serializer::class)
public sealed class InlineCodespaceStateX055cfe91 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Unknown`.
   */
  public data object Unknown : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Unknown"
  }

  /**
   * Documented value. Wire value: `Created`.
   */
  public data object Created : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Created"
  }

  /**
   * Documented value. Wire value: `Queued`.
   */
  public data object Queued : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Queued"
  }

  /**
   * Documented value. Wire value: `Provisioning`.
   */
  public data object Provisioning : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Provisioning"
  }

  /**
   * Documented value. Wire value: `Available`.
   */
  public data object Available : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Available"
  }

  /**
   * Documented value. Wire value: `Awaiting`.
   */
  public data object Awaiting : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Awaiting"
  }

  /**
   * Documented value. Wire value: `Unavailable`.
   */
  public data object Unavailable : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Unavailable"
  }

  /**
   * Documented value. Wire value: `Deleted`.
   */
  public data object Deleted : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Deleted"
  }

  /**
   * Documented value. Wire value: `Moved`.
   */
  public data object Moved : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Moved"
  }

  /**
   * Documented value. Wire value: `Shutdown`.
   */
  public data object Shutdown : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Shutdown"
  }

  /**
   * Documented value. Wire value: `Archived`.
   */
  public data object Archived : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Archived"
  }

  /**
   * Documented value. Wire value: `Starting`.
   */
  public data object Starting : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Starting"
  }

  /**
   * Documented value. Wire value: `ShuttingDown`.
   */
  public data object ShuttingDown : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "ShuttingDown"
  }

  /**
   * Documented value. Wire value: `Failed`.
   */
  public data object Failed : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Failed"
  }

  /**
   * Documented value. Wire value: `Exporting`.
   */
  public data object Exporting : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Exporting"
  }

  /**
   * Documented value. Wire value: `Updating`.
   */
  public data object Updating : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Updating"
  }

  /**
   * Documented value. Wire value: `Rebuilding`.
   */
  public data object Rebuilding : InlineCodespaceStateX055cfe91() {
    public override val `value`: String = "Rebuilding"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodespaceStateX055cfe91()

  public companion object {
    public fun fromValue(`value`: String): InlineCodespaceStateX055cfe91 = when (value) {
      Unknown.value -> Unknown
      Created.value -> Created
      Queued.value -> Queued
      Provisioning.value -> Provisioning
      Available.value -> Available
      Awaiting.value -> Awaiting
      Unavailable.value -> Unavailable
      Deleted.value -> Deleted
      Moved.value -> Moved
      Shutdown.value -> Shutdown
      Archived.value -> Archived
      Starting.value -> Starting
      ShuttingDown.value -> ShuttingDown
      Failed.value -> Failed
      Exporting.value -> Exporting
      Updating.value -> Updating
      Rebuilding.value -> Rebuilding
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodespaceStateX055cfe91> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodespaceStateX055cfe91", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodespaceStateX055cfe91 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodespaceStateX055cfe91) {
      encoder.encodeString(value.value)
    }
  }
}
