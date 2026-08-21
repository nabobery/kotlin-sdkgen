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
 * The level of permission to grant the access token for GitHub Actions workflows, workflow runs, and artifacts.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/actions
 */
@Serializable(with = InlineAppPermissionsActionsXafbce927.Serializer::class)
public sealed class InlineAppPermissionsActionsXafbce927 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : InlineAppPermissionsActionsXafbce927() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsActionsXafbce927() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsActionsXafbce927()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsActionsXafbce927 = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAppPermissionsActionsXafbce927> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsActionsXafbce927", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsActionsXafbce927 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsActionsXafbce927) {
      encoder.encodeString(value.value)
    }
  }
}
