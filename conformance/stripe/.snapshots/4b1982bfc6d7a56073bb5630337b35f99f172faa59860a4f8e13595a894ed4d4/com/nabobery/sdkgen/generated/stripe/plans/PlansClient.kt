package com.nabobery.sdkgen.generated.stripe.plans

import com.nabobery.sdkgen.generated.stripe.DeletedPlan
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PlansGetParameterX8261943e
import com.nabobery.sdkgen.generated.stripe.InlineV1PlansGetResponse200JsonXd2557dd3
import com.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormX3ea3b05f
import com.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormX3f96300a
import com.nabobery.sdkgen.generated.stripe.Plan
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object PlansCodecs {
  internal const val DELETEPLANSPLAN_REQUEST_CODEC_ID: String = "DeletePlansPlan.request"

  private val deletePlansPlanRequestCodec: MediaTypeCodec<JsonObject?> = DeletePlansPlanFormCodec

  private val deletePlansPlanResponseCodecAlternative0Codec: MediaTypeCodec<DeletedPlan> =
      KotlinxSerializationCodec("DeletePlansPlan.response.alternative0", DeletedPlan.Serializer, SdkJson)

  internal val deletePlansPlanResponseCodecAlternative0Registry: MediaTypeCodecRegistry<DeletedPlan>
      = MediaTypeCodecRegistry.of(deletePlansPlanResponseCodecAlternative0Codec)

  private val deletePlansPlanResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeletePlansPlan.response.alternative1", Error.Serializer, SdkJson)

  internal val deletePlansPlanResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deletePlansPlanResponseCodecAlternative1Codec)

  internal val deletePlansPlanRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deletePlansPlanRequestCodec)

  internal const val GETPLANS_REQUEST_CODEC_ID: String = "GetPlans.request"

  private val getPlansRequestCodec: MediaTypeCodec<JsonObject?> = GetPlansFormCodec

  private val getPlansResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PlansGetResponse200JsonXd2557dd3> =
      KotlinxSerializationCodec("GetPlans.response.alternative0", InlineV1PlansGetResponse200JsonXd2557dd3.Serializer, SdkJson)

  internal val getPlansResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PlansGetResponse200JsonXd2557dd3> =
      MediaTypeCodecRegistry.of(getPlansResponseCodecAlternative0Codec)

  private val getPlansResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPlans.response.alternative1", Error.Serializer, SdkJson)

  internal val getPlansResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPlansResponseCodecAlternative1Codec)

  internal val getPlansRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPlansRequestCodec)

  internal const val GETPLANSPLAN_REQUEST_CODEC_ID: String = "GetPlansPlan.request"

  private val getPlansPlanRequestCodec: MediaTypeCodec<JsonObject?> = GetPlansPlanFormCodec

  private val getPlansPlanResponseCodecAlternative0Codec: MediaTypeCodec<Plan> =
      KotlinxSerializationCodec("GetPlansPlan.response.alternative0", Plan.Serializer, SdkJson)

  internal val getPlansPlanResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Plan> =
      MediaTypeCodecRegistry.of(getPlansPlanResponseCodecAlternative0Codec)

  private val getPlansPlanResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPlansPlan.response.alternative1", Error.Serializer, SdkJson)

  internal val getPlansPlanResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPlansPlanResponseCodecAlternative1Codec)

  internal val getPlansPlanRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPlansPlanRequestCodec)

  internal const val POSTPLANS_REQUEST_CODEC_ID: String = "PostPlans.request"

  private val postPlansRequestCodec: MediaTypeCodec<InlineV1PlansPostRequestFormX3f96300a> =
      PostPlansFormCodec

  private val postPlansResponseCodecAlternative0Codec: MediaTypeCodec<Plan> =
      KotlinxSerializationCodec("PostPlans.response.alternative0", Plan.Serializer, SdkJson)

  internal val postPlansResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Plan> =
      MediaTypeCodecRegistry.of(postPlansResponseCodecAlternative0Codec)

  private val postPlansResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPlans.response.alternative1", Error.Serializer, SdkJson)

  internal val postPlansResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPlansResponseCodecAlternative1Codec)

  internal val postPlansRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PlansPostRequestFormX3f96300a> =
      MediaTypeCodecRegistry.of(postPlansRequestCodec)

  internal const val POSTPLANSPLAN_REQUEST_CODEC_ID: String = "PostPlansPlan.request"

  private val postPlansPlanRequestCodec: MediaTypeCodec<InlineV1PlansPostRequestFormX3ea3b05f?> =
      PostPlansPlanFormCodec

  private val postPlansPlanResponseCodecAlternative0Codec: MediaTypeCodec<Plan> =
      KotlinxSerializationCodec("PostPlansPlan.response.alternative0", Plan.Serializer, SdkJson)

  internal val postPlansPlanResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Plan> =
      MediaTypeCodecRegistry.of(postPlansPlanResponseCodecAlternative0Codec)

  private val postPlansPlanResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPlansPlan.response.alternative1", Error.Serializer, SdkJson)

  internal val postPlansPlanResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPlansPlanResponseCodecAlternative1Codec)

  internal val postPlansPlanRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PlansPostRequestFormX3ea3b05f?> =
      MediaTypeCodecRegistry.of(postPlansPlanRequestCodec)

  internal object DeletePlansPlanFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeletePlansPlan.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetPlansFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPlans.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetPlansPlanFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPlansPlan.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPlansFormCodec : MediaTypeCodec<InlineV1PlansPostRequestFormX3f96300a> {
    override val id: String = "PostPlans.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PlansPostRequestFormX3f96300a, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.amountDecimal?.let { formValue0 ->
        form.add("amount_decimal", formValue0)
      }
      request.billingScheme?.let { formValue0 ->
        form.add("billing_scheme", formValue0.value)
      }
      form.add("currency", request.currency)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.id?.let { formValue0 ->
        form.add("id", formValue0)
      }
      form.add("interval", request.interval.value)
      request.intervalCount?.let { formValue0 ->
        form.add("interval_count", formValue0.toString())
      }
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PlansPostRequestFormMetadataAnyOf2X7eddb6cf).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.meter?.let { formValue0 ->
        form.add("meter", formValue0)
      }
      request.nickname?.let { formValue0 ->
        form.add("nickname", formValue0)
      }
      request.product?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31 != null -> {
            requireNotNull(formValue0.inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31).active?.let { formValue3 ->
              form.add("product" + "[active]", formValue3.toString())
            }
            requireNotNull(formValue0.inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31).id?.let { formValue3 ->
              form.add("product" + "[id]", formValue3)
            }
            requireNotNull(formValue0.inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31).metadata?.let { formValue3 ->
              formValue3.forEach { (formKey4, formMapValue4) ->
                form.add("product" + "[metadata]" + "[" + formKey4 + "]", formMapValue4)
              }
            }
            form.add("product" + "[name]", requireNotNull(formValue0.inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31).name)
            requireNotNull(formValue0.inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31).statementDescriptor?.let { formValue3 ->
              form.add("product" + "[statement_descriptor]", formValue3)
            }
            requireNotNull(formValue0.inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31).taxCode?.let { formValue3 ->
              form.add("product" + "[tax_code]", formValue3)
            }
            requireNotNull(formValue0.inlineV1PlansPostRequestFormProductAnyOf1X83e9ef31).unitLabel?.let { formValue3 ->
              form.add("product" + "[unit_label]", formValue3)
            }
          }
          formValue0.branch2 != null -> {
            form.add("product", requireNotNull(formValue0.branch2))
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.tiers?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("tiers", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            formElement1.flatAmount?.let { formValue3 ->
              form.add("tiers" + "[" + formIndex1 + "]" + "[flat_amount]", formValue3.toString())
            }
            formElement1.flatAmountDecimal?.let { formValue3 ->
              form.add("tiers" + "[" + formIndex1 + "]" + "[flat_amount_decimal]", formValue3)
            }
            formElement1.unitAmount?.let { formValue3 ->
              form.add("tiers" + "[" + formIndex1 + "]" + "[unit_amount]", formValue3.toString())
            }
            formElement1.unitAmountDecimal?.let { formValue3 ->
              form.add("tiers" + "[" + formIndex1 + "]" + "[unit_amount_decimal]", formValue3)
            }
            require(formElement1.upTo.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formElement1.upTo.inlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e != null -> {
                form.add("tiers" + "[" + formIndex1 + "]" + "[up_to]", requireNotNull(formElement1.upTo.inlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e).value)
              }
              formElement1.upTo.branch2 != null -> {
                form.add("tiers" + "[" + formIndex1 + "]" + "[up_to]", requireNotNull(formElement1.upTo.branch2).toString())
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
        }
      }
      request.tiersMode?.let { formValue0 ->
        form.add("tiers_mode", formValue0.value)
      }
      request.transformUsage?.let { formValue0 ->
        form.add("transform_usage" + "[divide_by]", formValue0.divideBy.toString())
        form.add("transform_usage" + "[round]", formValue0.round.value)
      }
      request.trialPeriodDays?.let { formValue0 ->
        form.add("trial_period_days", formValue0.toString())
      }
      request.usageType?.let { formValue0 ->
        form.add("usage_type", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PlansPostRequestFormX3f96300a {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPlansPlanFormCodec : MediaTypeCodec<InlineV1PlansPostRequestFormX3ea3b05f?> {
    override val id: String = "PostPlansPlan.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PlansPostRequestFormX3ea3b05f?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.nickname?.let { formValue0 ->
        form.add("nickname", formValue0)
      }
      request.product?.let { formValue0 ->
        form.add("product", formValue0)
      }
      request.trialPeriodDays?.let { formValue0 ->
        form.add("trial_period_days", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PlansPostRequestFormX3ea3b05f? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'plans' group of Stripe API.
 */
public class PlansClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@PlansClient.authentication)

  /**
   * <p>Deleting plans means new subscribers can’t be added. Existing subscribers aren’t affected.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param plan Wire parameter `plan`.
   * @param options Execution options.
   */
  public suspend fun deletePlansPlanWithResponse(
    request: JsonObject? = null,
    plan: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeletePlansPlanResponse> = executor.executeWithResponse<JsonObject?, DeletePlansPlanResponse>(SdkExecutionRequest(deletePlansPlanMetadata, baseUri, request, listOf(PlansCodecs.DELETEPLANSPLAN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "plan", values = listOf(plan.toString())))
  }), PlansCodecs.deletePlansPlanRequestCodecRegistry, DeletePlansPlanResponseDecoder, options)

  /**
   * <p>Returns a list of your plans.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Only return plans that are active or inactive (e.g., pass `false` to list all inactive plans).
   * @param created A filter on the list, based on the object `created` field. The value can be a string with an integer
   * Unix timestamp, or it can be a dictionary with a number of different query options.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param product Only return plans for the given product.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getPlansWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    created: InlineV1PlansGetParameterX8261943e? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    product: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPlansResponse> = executor.executeWithResponse<JsonObject?, GetPlansResponse>(SdkExecutionRequest(getPlansMetadata, baseUri, request, listOf(PlansCodecs.GETPLANS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "active", values = active?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), PlansCodecs.getPlansRequestCodecRegistry, GetPlansResponseDecoder, options)

  /**
   * <p>Retrieves the plan with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param plan Wire parameter `plan`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPlansPlanWithResponse(
    request: JsonObject? = null,
    plan: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPlansPlanResponse> = executor.executeWithResponse<JsonObject?, GetPlansPlanResponse>(SdkExecutionRequest(getPlansPlanMetadata, baseUri, request, listOf(PlansCodecs.GETPLANSPLAN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "plan", values = listOf(plan.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PlansCodecs.getPlansPlanRequestCodecRegistry, GetPlansPlanResponseDecoder, options)

  /**
   * <p>You can now model subscriptions more flexibly using the <a href="#prices">Prices API</a>. It replaces the Plans
   * API and is backwards compatible to simplify your migration.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postPlansWithResponse(request: InlineV1PlansPostRequestFormX3f96300a, options: CallOptions = CallOptions()): SdkResponseResult<PostPlansResponse> = executor.executeWithResponse<InlineV1PlansPostRequestFormX3f96300a, PostPlansResponse>(SdkExecutionRequest(postPlansMetadata, baseUri, request, listOf(PlansCodecs.POSTPLANS_REQUEST_CODEC_ID), emptyList()), PlansCodecs.postPlansRequestCodecRegistry, PostPlansResponseDecoder, options)

  /**
   * <p>Updates the specified plan by setting the values of the parameters passed. Any parameters not provided are left
   * unchanged. By design, you cannot change a plan’s ID, amount, currency, or billing cycle.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param plan Wire parameter `plan`.
   * @param options Execution options.
   */
  public suspend fun postPlansPlanWithResponse(
    request: InlineV1PlansPostRequestFormX3ea3b05f? = null,
    plan: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPlansPlanResponse> = executor.executeWithResponse<InlineV1PlansPostRequestFormX3ea3b05f?, PostPlansPlanResponse>(SdkExecutionRequest(postPlansPlanMetadata, baseUri, request, listOf(PlansCodecs.POSTPLANSPLAN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "plan", values = listOf(plan.toString())))
  }), PlansCodecs.postPlansPlanRequestCodecRegistry, PostPlansPlanResponseDecoder, options)

  /**
   * Typed response alternatives for `DeletePlansPlan`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeletePlansPlanResponse {
    public class SuccessJson(
      public val json: DeletedPlan,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeletePlansPlanResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeletePlansPlanResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeletePlansPlanResponse
  }

  private object DeletePlansPlanResponseDecoder : SdkResponseAlternativeDecoder<DeletePlansPlanResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeletePlansPlanResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeletePlansPlanResponse> = when {
      alternative.id == "DeletePlansPlan.response.alternative0" -> SdkResponseDecodeResult(
        value = DeletePlansPlanResponse.SuccessJson(
          json = PlansCodecs.deletePlansPlanResponseCodecAlternative0Registry.select(listOf("DeletePlansPlan.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeletePlansPlan.response.alternative1" -> SdkResponseDecodeResult(
        value = DeletePlansPlanResponse.DefaultJson(
          json = PlansCodecs.deletePlansPlanResponseCodecAlternative1Registry.select(listOf("DeletePlansPlan.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): DeletePlansPlanResponse = DeletePlansPlanResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPlans`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPlansResponse {
    public class SuccessJson(
      public val json: InlineV1PlansGetResponse200JsonXd2557dd3,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPlansResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPlansResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPlansResponse
  }

  private object GetPlansResponseDecoder : SdkResponseAlternativeDecoder<GetPlansResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPlansResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPlansResponse> = when {
      alternative.id == "GetPlans.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPlansResponse.SuccessJson(
          json = PlansCodecs.getPlansResponseCodecAlternative0Registry.select(listOf("GetPlans.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPlans.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPlansResponse.DefaultJson(
          json = PlansCodecs.getPlansResponseCodecAlternative1Registry.select(listOf("GetPlans.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetPlansResponse = GetPlansResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPlansPlan`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPlansPlanResponse {
    public class SuccessJson(
      public val json: Plan,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPlansPlanResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPlansPlanResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPlansPlanResponse
  }

  private object GetPlansPlanResponseDecoder : SdkResponseAlternativeDecoder<GetPlansPlanResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPlansPlanResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPlansPlanResponse> = when {
      alternative.id == "GetPlansPlan.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPlansPlanResponse.SuccessJson(
          json = PlansCodecs.getPlansPlanResponseCodecAlternative0Registry.select(listOf("GetPlansPlan.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPlansPlan.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPlansPlanResponse.DefaultJson(
          json = PlansCodecs.getPlansPlanResponseCodecAlternative1Registry.select(listOf("GetPlansPlan.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetPlansPlanResponse = GetPlansPlanResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPlans`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostPlansResponse {
    public class SuccessJson(
      public val json: Plan,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPlansResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPlansResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPlansResponse
  }

  private object PostPlansResponseDecoder : SdkResponseAlternativeDecoder<PostPlansResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPlansResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPlansResponse> = when {
      alternative.id == "PostPlans.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPlansResponse.SuccessJson(
          json = PlansCodecs.postPlansResponseCodecAlternative0Registry.select(listOf("PostPlans.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPlans.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPlansResponse.DefaultJson(
          json = PlansCodecs.postPlansResponseCodecAlternative1Registry.select(listOf("PostPlans.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostPlansResponse = PostPlansResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPlansPlan`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostPlansPlanResponse {
    public class SuccessJson(
      public val json: Plan,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPlansPlanResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPlansPlanResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPlansPlanResponse
  }

  private object PostPlansPlanResponseDecoder : SdkResponseAlternativeDecoder<PostPlansPlanResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPlansPlanResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPlansPlanResponse> = when {
      alternative.id == "PostPlansPlan.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPlansPlanResponse.SuccessJson(
          json = PlansCodecs.postPlansPlanResponseCodecAlternative0Registry.select(listOf("PostPlansPlan.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPlansPlan.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPlansPlanResponse.DefaultJson(
          json = PlansCodecs.postPlansPlanResponseCodecAlternative1Registry.select(listOf("PostPlansPlan.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostPlansPlanResponse = PostPlansPlanResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deletePlansPlanMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeletePlansPlan",
          method = "DELETE",
          path = "/v1/plans/{plan}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedPlan",
              mode = SdkResponseMode.BUFFERED,
              id = "DeletePlansPlan.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeletePlansPlan.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val getPlansMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPlans",
          method = "GET",
          path = "/v1/plans",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PlansGetResponse200JsonXd2557dd3",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPlans.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPlans.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val getPlansPlanMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPlansPlan",
          method = "GET",
          path = "/v1/plans/{plan}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Plan",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPlansPlan.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPlansPlan.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postPlansMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPlans",
          method = "POST",
          path = "/v1/plans",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Plan",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPlans.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPlans.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val postPlansPlanMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPlansPlan",
          method = "POST",
          path = "/v1/plans/{plan}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Plan",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPlansPlan.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPlansPlan.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
