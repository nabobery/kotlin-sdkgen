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
 * The level of permission to grant the access token for pull requests and related comments, assignees, labels,
 * milestones, and merges.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/pull_requests
 */
@Serializable(with = InlineAppPermissionsPullRequestsXa4724cb2.Serializer::class)
public sealed class InlineAppPermissionsPullRequestsXa4724cb2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsPullRequestsXa4724cb2() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsPullRequestsXa4724cb2() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsPullRequestsXa4724cb2()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsPullRequestsXa4724cb2 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsPullRequestsXa4724cb2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsPullRequestsXa4724cb2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsPullRequestsXa4724cb2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsPullRequestsXa4724cb2) {
      encoder.encodeString(value.value)
    }
  }
}
