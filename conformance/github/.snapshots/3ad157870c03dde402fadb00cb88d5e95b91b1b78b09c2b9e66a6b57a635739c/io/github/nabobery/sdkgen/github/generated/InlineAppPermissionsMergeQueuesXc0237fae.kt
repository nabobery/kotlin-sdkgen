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
 * The level of permission to grant the access token to manage the merge queues for a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/merge_queues
 */
@Serializable(with = InlineAppPermissionsMergeQueuesXc0237fae.Serializer::class)
public sealed class InlineAppPermissionsMergeQueuesXc0237fae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsMergeQueuesXc0237fae() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsMergeQueuesXc0237fae() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsMergeQueuesXc0237fae()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsMergeQueuesXc0237fae = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsMergeQueuesXc0237fae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAppPermissionsMergeQueuesXc0237fae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsMergeQueuesXc0237fae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsMergeQueuesXc0237fae) {
      encoder.encodeString(value.value)
    }
  }
}
