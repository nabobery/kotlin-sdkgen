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
 * Machine-readable error code
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/403/content/application~1json/schema/pro
 * perties/errors/items/properties/code
 */
@Serializable(with = InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1.Serializer::class)
public sealed class InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing`.
   */
  public data object Missing : InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1() {
    public override val `value`: String = "missing"
  }

  /**
   * Documented value. Wire value: `missing_field`.
   */
  public data object MissingField : InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1() {
    public override val `value`: String = "missing_field"
  }

  /**
   * Documented value. Wire value: `invalid`.
   */
  public data object Invalid : InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1() {
    public override val `value`: String = "invalid"
  }

  /**
   * Documented value. Wire value: `already_exists`.
   */
  public data object AlreadyExists : InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1() {
    public override val `value`: String = "already_exists"
  }

  /**
   * Documented value. Wire value: `unprocessable`.
   */
  public data object Unprocessable : InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1() {
    public override val `value`: String = "unprocessable"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1 = when (value) {
      Missing.value -> Missing
      MissingField.value -> MissingField
      Invalid.value -> Invalid
      AlreadyExists.value -> AlreadyExists
      Unprocessable.value -> Unprocessable
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse403JsonErrorsItemCodeXa48825e1) {
      encoder.encodeString(value.value)
    }
  }
}
