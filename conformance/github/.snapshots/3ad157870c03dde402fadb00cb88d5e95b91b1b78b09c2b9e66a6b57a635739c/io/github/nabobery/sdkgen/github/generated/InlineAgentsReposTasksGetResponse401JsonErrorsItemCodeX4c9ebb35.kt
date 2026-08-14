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
 * Machine-readable error code
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/401/content/appl
 * ication~1json/schema/properties/errors/items/properties/code
 */
@Serializable(with = InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing`.
   */
  public data object Missing : InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35() {
    public override val `value`: String = "missing"
  }

  /**
   * Documented value. Wire value: `missing_field`.
   */
  public data object MissingField : InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35() {
    public override val `value`: String = "missing_field"
  }

  /**
   * Documented value. Wire value: `invalid`.
   */
  public data object Invalid : InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35() {
    public override val `value`: String = "invalid"
  }

  /**
   * Documented value. Wire value: `already_exists`.
   */
  public data object AlreadyExists : InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35() {
    public override val `value`: String = "already_exists"
  }

  /**
   * Documented value. Wire value: `unprocessable`.
   */
  public data object Unprocessable : InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35() {
    public override val `value`: String = "unprocessable"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35 = when (value) {
      Missing.value -> Missing
      MissingField.value -> MissingField
      Invalid.value -> Invalid
      AlreadyExists.value -> AlreadyExists
      Unprocessable.value -> Unprocessable
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse401JsonErrorsItemCodeX4c9ebb35) {
      encoder.encodeString(value.value)
    }
  }
}
