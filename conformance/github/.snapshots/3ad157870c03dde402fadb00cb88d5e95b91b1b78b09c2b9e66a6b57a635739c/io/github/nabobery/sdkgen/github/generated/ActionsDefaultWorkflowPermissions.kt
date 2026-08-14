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
 * The default workflow permissions granted to the GITHUB_TOKEN when running workflows.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-default-workflow-permissions
 */
@Serializable(with = ActionsDefaultWorkflowPermissions.Serializer::class)
public sealed class ActionsDefaultWorkflowPermissions {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `read`.
   */
  public data object Read : ActionsDefaultWorkflowPermissions() {
    public override val `value`: String = "read"
  }

  /**
   * Documented value. Wire value: `write`.
   */
  public data object Write : ActionsDefaultWorkflowPermissions() {
    public override val `value`: String = "write"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ActionsDefaultWorkflowPermissions()

  public companion object {
    public fun fromValue(`value`: String): ActionsDefaultWorkflowPermissions = when (value) {
      Read.value -> Read
      Write.value -> Write
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ActionsDefaultWorkflowPermissions> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.ActionsDefaultWorkflowPermissions", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ActionsDefaultWorkflowPermissions = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ActionsDefaultWorkflowPermissions) {
      encoder.encodeString(value.value)
    }
  }
}
