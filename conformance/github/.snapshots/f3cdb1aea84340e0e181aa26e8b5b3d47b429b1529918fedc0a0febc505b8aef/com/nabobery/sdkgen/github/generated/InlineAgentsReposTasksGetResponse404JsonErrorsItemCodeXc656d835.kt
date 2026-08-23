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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks/get/responses/404/content/application~1js
 * on/schema/properties/errors/items/properties/code
 */
@Serializable(with = InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835.Serializer::class)
public sealed class InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing`.
   */
  public data object Missing : InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835() {
    public override val `value`: String = "missing"
  }

  /**
   * Documented value. Wire value: `missing_field`.
   */
  public data object MissingField : InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835() {
    public override val `value`: String = "missing_field"
  }

  /**
   * Documented value. Wire value: `invalid`.
   */
  public data object Invalid : InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835() {
    public override val `value`: String = "invalid"
  }

  /**
   * Documented value. Wire value: `already_exists`.
   */
  public data object AlreadyExists : InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835() {
    public override val `value`: String = "already_exists"
  }

  /**
   * Documented value. Wire value: `unprocessable`.
   */
  public data object Unprocessable : InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835() {
    public override val `value`: String = "unprocessable"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835()

  public companion object {
    public fun fromValue(`value`: String): InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835 = when (value) {
      Missing.value -> Missing
      MissingField.value -> MissingField
      Invalid.value -> Invalid
      AlreadyExists.value -> AlreadyExists
      Unprocessable.value -> Unprocessable
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse404JsonErrorsItemCodeXc656d835) {
      encoder.encodeString(value.value)
    }
  }
}
