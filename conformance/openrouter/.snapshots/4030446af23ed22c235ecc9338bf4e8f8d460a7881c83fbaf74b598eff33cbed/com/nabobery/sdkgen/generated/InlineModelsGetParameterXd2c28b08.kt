package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Filter to models with endpoints in the given data region. Currently only "eu" is supported.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1models/get/parameters/16/schema
 */
@Serializable(with = InlineModelsGetParameterXd2c28b08.Serializer::class)
public sealed class InlineModelsGetParameterXd2c28b08 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eu`.
   */
  public data object Eu : InlineModelsGetParameterXd2c28b08() {
    public override val `value`: String = "eu"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineModelsGetParameterXd2c28b08()

  public companion object {
    public fun fromValue(`value`: String): InlineModelsGetParameterXd2c28b08 = when (value) {
      Eu.value -> Eu
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineModelsGetParameterXd2c28b08> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineModelsGetParameterXd2c28b08", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineModelsGetParameterXd2c28b08 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineModelsGetParameterXd2c28b08) {
      encoder.encodeString(value.value)
    }
  }
}
