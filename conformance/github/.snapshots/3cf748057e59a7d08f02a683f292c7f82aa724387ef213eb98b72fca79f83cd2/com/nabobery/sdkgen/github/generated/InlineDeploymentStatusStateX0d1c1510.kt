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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/deployment-status/properties/state
 */
@Serializable(with = InlineDeploymentStatusStateX0d1c1510.Serializer::class)
public sealed class InlineDeploymentStatusStateX0d1c1510 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineDeploymentStatusStateX0d1c1510() {
    public override val `value`: String = "error"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineDeploymentStatusStateX0d1c1510() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineDeploymentStatusStateX0d1c1510() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineDeploymentStatusStateX0d1c1510() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineDeploymentStatusStateX0d1c1510() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineDeploymentStatusStateX0d1c1510() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineDeploymentStatusStateX0d1c1510() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeploymentStatusStateX0d1c1510()

  public companion object {
    public fun fromValue(`value`: String): InlineDeploymentStatusStateX0d1c1510 = when (value) {
      Error.value -> Error
      Failure.value -> Failure
      Inactive.value -> Inactive
      Pending.value -> Pending
      Success.value -> Success
      Queued.value -> Queued
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDeploymentStatusStateX0d1c1510> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDeploymentStatusStateX0d1c1510", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeploymentStatusStateX0d1c1510 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeploymentStatusStateX0d1c1510) {
      encoder.encodeString(value.value)
    }
  }
}
