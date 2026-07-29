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
 * The state of the status. When you set a transient deployment to `inactive`, the deployment will be shown as
 * `destroyed` in GitHub.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1deployments~1{deployment_id}~1statuses/post/requestBody
 * /content/application~1json/schema/properties/state
 */
@Serializable(with = InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c.Serializer::class)
public sealed class InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c() {
    public override val `value`: String = "error"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c() {
    public override val `value`: String = "success"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c()

  public companion object {
    public fun fromValue(`value`: String): InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c = when (value) {
      Error.value -> Error
      Failure.value -> Failure
      Inactive.value -> Inactive
      InProgress.value -> InProgress
      Queued.value -> Queued
      Pending.value -> Pending
      Success.value -> Success
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposDeploymentsStatusesPostRequestJsonStateX4052e42c) {
      encoder.encodeString(value.value)
    }
  }
}
