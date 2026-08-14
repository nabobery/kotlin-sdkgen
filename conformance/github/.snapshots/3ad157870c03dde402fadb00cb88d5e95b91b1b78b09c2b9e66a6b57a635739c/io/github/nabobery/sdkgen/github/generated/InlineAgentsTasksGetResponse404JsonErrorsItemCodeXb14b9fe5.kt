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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/404/content/application~1json/schema/pro
 * perties/errors/items/properties/code
 */
@Serializable(with = InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5.Serializer::class)
public sealed class InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing`.
   */
  public data object Missing : InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5() {
    public override val `value`: String = "missing"
  }

  /**
   * Documented value. Wire value: `missing_field`.
   */
  public data object MissingField : InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5() {
    public override val `value`: String = "missing_field"
  }

  /**
   * Documented value. Wire value: `invalid`.
   */
  public data object Invalid : InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5() {
    public override val `value`: String = "invalid"
  }

  /**
   * Documented value. Wire value: `already_exists`.
   */
  public data object AlreadyExists : InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5() {
    public override val `value`: String = "already_exists"
  }

  /**
   * Documented value. Wire value: `unprocessable`.
   */
  public data object Unprocessable : InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5() {
    public override val `value`: String = "unprocessable"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5 = when (value) {
      Missing.value -> Missing
      MissingField.value -> MissingField
      Invalid.value -> Invalid
      AlreadyExists.value -> AlreadyExists
      Unprocessable.value -> Unprocessable
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse404JsonErrorsItemCodeXb14b9fe5) {
      encoder.encodeString(value.value)
    }
  }
}
