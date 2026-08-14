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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/post/responses/403/content/application~1j
 * son/schema/properties/errors/items/properties/code
 */
@Serializable(with = InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786.Serializer::class)
public sealed class InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing`.
   */
  public data object Missing : InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786() {
    public override val `value`: String = "missing"
  }

  /**
   * Documented value. Wire value: `missing_field`.
   */
  public data object MissingField : InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786() {
    public override val `value`: String = "missing_field"
  }

  /**
   * Documented value. Wire value: `invalid`.
   */
  public data object Invalid : InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786() {
    public override val `value`: String = "invalid"
  }

  /**
   * Documented value. Wire value: `already_exists`.
   */
  public data object AlreadyExists : InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786() {
    public override val `value`: String = "already_exists"
  }

  /**
   * Documented value. Wire value: `unprocessable`.
   */
  public data object Unprocessable : InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786() {
    public override val `value`: String = "unprocessable"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786 = when (value) {
      Missing.value -> Missing
      MissingField.value -> MissingField
      Invalid.value -> Invalid
      AlreadyExists.value -> AlreadyExists
      Unprocessable.value -> Unprocessable
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksPostResponse403JsonErrorsItemCodeXa6f4d786) {
      encoder.encodeString(value.value)
    }
  }
}
