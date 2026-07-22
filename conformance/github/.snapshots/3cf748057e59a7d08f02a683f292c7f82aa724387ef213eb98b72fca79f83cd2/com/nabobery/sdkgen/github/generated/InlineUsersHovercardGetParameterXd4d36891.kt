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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1hovercard/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1hovercard/get/parameters/1/schema
 */
@Serializable(with = InlineUsersHovercardGetParameterXd4d36891.Serializer::class)
public sealed class InlineUsersHovercardGetParameterXd4d36891 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineUsersHovercardGetParameterXd4d36891() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `repository`.
   */
  public data object Repository : InlineUsersHovercardGetParameterXd4d36891() {
    public override val `value`: String = "repository"
  }

  /**
   * Documented value. Wire value: `issue`.
   */
  public data object Issue : InlineUsersHovercardGetParameterXd4d36891() {
    public override val `value`: String = "issue"
  }

  /**
   * Documented value. Wire value: `pull_request`.
   */
  public data object PullRequest : InlineUsersHovercardGetParameterXd4d36891() {
    public override val `value`: String = "pull_request"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUsersHovercardGetParameterXd4d36891()

  public companion object {
    public fun fromValue(`value`: String): InlineUsersHovercardGetParameterXd4d36891 = when (value) {
      Organization.value -> Organization
      Repository.value -> Repository
      Issue.value -> Issue
      PullRequest.value -> PullRequest
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineUsersHovercardGetParameterXd4d36891> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUsersHovercardGetParameterXd4d36891", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUsersHovercardGetParameterXd4d36891 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUsersHovercardGetParameterXd4d36891) {
      encoder.encodeString(value.value)
    }
  }
}
