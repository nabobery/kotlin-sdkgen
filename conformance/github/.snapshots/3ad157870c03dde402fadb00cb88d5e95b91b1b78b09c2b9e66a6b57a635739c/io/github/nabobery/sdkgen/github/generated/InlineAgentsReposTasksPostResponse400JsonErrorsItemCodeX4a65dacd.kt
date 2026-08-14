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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/400/content/application~1j
 * son/schema/properties/errors/items/properties/code
 */
@Serializable(with = InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd.Serializer::class)
public sealed class InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing`.
   */
  public data object Missing : InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd() {
    public override val `value`: String = "missing"
  }

  /**
   * Documented value. Wire value: `missing_field`.
   */
  public data object MissingField : InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd() {
    public override val `value`: String = "missing_field"
  }

  /**
   * Documented value. Wire value: `invalid`.
   */
  public data object Invalid : InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd() {
    public override val `value`: String = "invalid"
  }

  /**
   * Documented value. Wire value: `already_exists`.
   */
  public data object AlreadyExists : InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd() {
    public override val `value`: String = "already_exists"
  }

  /**
   * Documented value. Wire value: `unprocessable`.
   */
  public data object Unprocessable : InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd() {
    public override val `value`: String = "unprocessable"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd = when (value) {
      Missing.value -> Missing
      MissingField.value -> MissingField
      Invalid.value -> Invalid
      AlreadyExists.value -> AlreadyExists
      Unprocessable.value -> Unprocessable
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse400JsonErrorsItemCodeX4a65dacd) {
      encoder.encodeString(value.value)
    }
  }
}
