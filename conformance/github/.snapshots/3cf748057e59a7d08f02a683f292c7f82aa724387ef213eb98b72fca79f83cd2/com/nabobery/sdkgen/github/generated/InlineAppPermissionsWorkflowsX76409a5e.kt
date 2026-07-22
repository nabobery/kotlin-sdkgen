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
 * The level of permission to grant the access token to update GitHub Actions workflow files.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/app-permissions/properties/workflows
 */
@Serializable(with = InlineAppPermissionsWorkflowsX76409a5e.Serializer::class)
public sealed class InlineAppPermissionsWorkflowsX76409a5e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : InlineAppPermissionsWorkflowsX76409a5e() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAppPermissionsWorkflowsX76409a5e()

  public companion object {
    public fun fromValue(`value`: String): InlineAppPermissionsWorkflowsX76409a5e = when (value) {
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAppPermissionsWorkflowsX76409a5e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAppPermissionsWorkflowsX76409a5e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAppPermissionsWorkflowsX76409a5e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAppPermissionsWorkflowsX76409a5e) {
      encoder.encodeString(value.value)
    }
  }
}
